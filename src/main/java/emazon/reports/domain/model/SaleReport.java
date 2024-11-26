package emazon.reports.domain.model;


import java.util.Date;
import java.util.List;

public class SaleReport {
    private String id;
    private Long userId;
    private String userEmail;
    private String creationDate;
    private Double totalAmount;
    private List<SaleDetails> saleDetails;
    private Date saleDate;

    public SaleReport() {
    }

    public SaleReport(String id, Long userId, String userEmail, String creationDate, Double totalAmount, List<SaleDetails> saleDetails, Date saleDate) {
        this.id = id;
        this.userId = userId;
        this.userEmail = userEmail;
        this.creationDate = creationDate;
        this.totalAmount = totalAmount;
        this.saleDetails = saleDetails;
        this.saleDate = saleDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<SaleDetails> getSaleDetails() {
        return saleDetails;
    }

    public void setSaleDetails(List<SaleDetails> saleDetails) {
        this.saleDetails = saleDetails;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }
}
