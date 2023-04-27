public class CommonCommissionDto {
    private Long id;
    private String commissionType;
    private Double commissionValue;  
    private String commissionUnit;
    private Double minThresholdValue;
    private Double maxThresholdValue;
    private Double variableCommission;
    private String variableCommissionUnit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommissionType() {
        return commissionType;
    }

    public void setCommissionType(String commissionType) {
        this.commissionType = commissionType;
    }

    public Double getCommissionValue() {
        return commissionValue;
    }

    public void setCommissionValue(Double commissionValue) {
        this.commissionValue = commissionValue;
    }

    public String getCommissionUnit() {
        return commissionUnit;
    }

    public void setCommissionUnit(String commissionUnit) {
        this.commissionUnit = commissionUnit;
    }

    public Double getMinThresholdValue() {
        return minThresholdValue;
    }

    public void setMinThresholdValue(Double minThresholdValue) {
        this.minThresholdValue = minThresholdValue;
    }

    public Double getMaxThresholdValue() {
        return maxThresholdValue;
    }

    public void setMaxThresholdValue(Double maxThresholdValue) {
        this.maxThresholdValue = maxThresholdValue;
    }

    public Double getVariableCommission() {
        return variableCommission;
    }

    public void setVariableCommission(Double variableCommission) {
        this.variableCommission = variableCommission;
    }

    public String getVariableCommissionUnit() {
        return variableCommissionUnit;
    }

    public void setVariableCommissionUnit(String variableCommissionUnit) {
        this.variableCommissionUnit = variableCommissionUnit;
    }
}