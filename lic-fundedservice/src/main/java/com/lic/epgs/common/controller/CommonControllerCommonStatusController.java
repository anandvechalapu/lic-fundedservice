package com.lic.epgs.common.controller;

import com.lic.epgs.common.model.CommonControllerCommonStatus;
import com.lic.epgs.common.service.CommonControllerCommonStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/common/status")
public class CommonControllerCommonStatusController {

    @Autowired
    private CommonControllerCommonStatusService commonControllerCommonStatusService;

    @GetMapping(value = "/active")
    public List<CommonControllerCommonStatus> getActiveStatus() {
        return commonControllerCommonStatusService.findByIsActive(true);
    }

    @GetMapping(value = "/id")
    public List<CommonControllerCommonStatus> getStatusById(Long id) {
        return commonControllerCommonStatusService.findByIdAndIsActive(id, true);
    }

    @GetMapping(value = "/code")
    public List<CommonControllerCommonStatus> getStatusByCode(String code) {
        return commonControllerCommonStatusService.findByCodeAndIsActive(code, true);
    }

    @GetMapping(value = "/type")
    public List<CommonControllerCommonStatus> getStatusByType(String type) {
        return commonControllerCommonStatusService.findByTypeAndIsActive(type, true);
    }

    @GetMapping(value = "/description")
    public List<CommonControllerCommonStatus> getStatusByDescription(String description) {
        return commonControllerCommonStatusService.findByDescriptionAndIsActive(description, true);
    }

    @GetMapping(value = "/description1")
    public List<CommonControllerCommonStatus> getStatusByDescription1(String description1) {
        return commonControllerCommonStatusService.findByDescription1AndIsActive(description1, true);
    }

    @GetMapping(value = "/name")
    public List<CommonControllerCommonStatus> getStatusByName(String name) {
        return commonControllerCommonStatusService.findByNameAndIsActive(name, true);
    }

    @GetMapping(value = "/orderbytype")
    public List<CommonControllerCommonStatus> getStatusByOrderByType() {
        return commonControllerCommonStatusService.findByIsActiveOrderByTypeAsc(true);
    }

    @GetMapping(value = "/orderbyname")
    public List<CommonControllerCommonStatus> getStatusByOrderByName() {
        return commonControllerCommonStatusService.findByIsActiveOrderByNameDesc(true);
    }
}