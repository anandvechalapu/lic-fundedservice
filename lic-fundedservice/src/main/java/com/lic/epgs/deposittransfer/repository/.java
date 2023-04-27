import com.lic.epgs.deposittransfer.dto.ApiResponseDto;
import com.lic.epgs.deposittransfer.dto.DepositTransferNotesDto;
import com.lic.epgs.deposittransfer.exception.PersistenceException;
import com.lic.epgs.deposittransfer.model.DepositTransferNotes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date;

@Repository
public class DepositTransferController_saveDepositnote {

    @Autowired
    private EntityManager entityManager;

    private static final Logger LOG = LoggerFactory.getLogger(DepositTransferController_saveDepositNote.class);

    public ApiResponseDto saveDepositNote(DepositTransferNotesDto depositTransferNotesDto) {
        try {
            DepositTransferNotes depositTransferNotes = new DepositTransferNotes();
            depositTransferNotes.setTransferId(depositTransferNotesDto.getTransferId());
            depositTransferNotes.setNoteContents(depositTransferNotesDto.getNoteContents());
            depositTransferNotes.setCreatedBy(depositTransferNotesDto.getCreatedBy());
            depositTransferNotes.setNotesBy(depositTransferNotesDto.getNotesBy());
            depositTransferNotes.setCreatedOn(new Date());
            depositTransferNotes.setIsActive(true);

            entityManager.persist(depositTransferNotes);
            return new ApiResponseDto(depositTransferNotes.getTransferId(), "SUCCESS", "Deposit transfer note saved successfully");
        } catch (DataIntegrityViolationException ex) {
            LOG.error("DataIntegrityViolationException occured while saving deposit transfer note");
            return new ApiResponseDto(depositTransferNotesDto.getTransferId(), "ERROR", "Failed to save deposit transfer note");
        } catch (PersistenceException ex) {
            LOG.error("PersistenceException occured while saving deposit transfer note");
            return new ApiResponseDto(depositTransferNotesDto.getTransferId(), "ERROR", "Failed to save deposit transfer note");
        } catch (Exception ex) {
            LOG.error("Exception occured while saving deposit transfer note");
            return new ApiResponseDto(depositTransferNotesDto.getTransferId(), "ERROR", "Failed to save deposit transfer note");
        }
    }
}