package org.openelisglobal.program.controller.pathology;

import java.util.Base64;
import java.util.List;

import org.openelisglobal.program.valueholder.pathology.PathologyBlock;
import org.openelisglobal.program.valueholder.pathology.PathologySample.PathologyStatus;
import org.openelisglobal.program.valueholder.pathology.PathologySlide;

public class PathologySampleForm {

    private PathologyStatus status;

    private List<PathologyBlock> blocks;
    private List<PathologySlideForm> slides;
    private String assignedPathologistId;
    private String assignedTechnicianId;

    private List<String> techniques;
    private List<String> requests;
    private List<String> resolvedRequests;
    private List<String> deletedRequests;
    private String grossExam;
    private String microscopyExam;

    private List<String> conclusions;
    private String conclusionText;
    private String systemUserId;

    private Boolean release;
    private Boolean referToImmunoHistoChemistry;

    public PathologyStatus getStatus() {
        return status;
    }

    public void setStatus(PathologyStatus status) {
        this.status = status;
    }

    public List<PathologyBlock> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<PathologyBlock> blocks) {
        this.blocks = blocks;
    }

    public List<PathologySlideForm> getSlides() {
        return slides;
    }

    public void setSlides(List<PathologySlideForm> slides) {
        this.slides = slides;
    }

    public String getAssignedPathologistId() {
        return assignedPathologistId;
    }

    public void setAssignedPathologistId(String assignedPathologistId) {
        this.assignedPathologistId = assignedPathologistId;
    }

    public String getAssignedTechnicianId() {
        return assignedTechnicianId;
    }

    public void setAssignedTechnicianId(String assignedTechnicianId) {
        this.assignedTechnicianId = assignedTechnicianId;
    }

    public List<String> getTechniques() {
        return techniques;
    }

    public void setTechniques(List<String> techniques) {
        this.techniques = techniques;
    }

    public List<String> getRequests() {
        return requests;
    }

    public void setRequests(List<String> requests) {
        this.requests = requests;
    }

    public String getGrossExam() {
        return grossExam;
    }

    public void setGrossExam(String grossExam) {
        this.grossExam = grossExam;
    }

    public String getMicroscopyExam() {
        return microscopyExam;
    }

    public void setMicroscopyExam(String microscopyExam) {
        this.microscopyExam = microscopyExam;
    }

    public String getConclusionText() {
        return conclusionText;
    }

    public void setConclusionText(String conclusionText) {
        this.conclusionText = conclusionText;
    }

    public List<String> getResolvedRequests() {
        return resolvedRequests;
    }

    public void setResolvedRequests(List<String> resolvedRequests) {
        this.resolvedRequests = resolvedRequests;
    }

    public List<String> getDeletedRequests() {
        return deletedRequests;
    }

    public void setDeletedRequests(List<String> deletedRequests) {
        this.deletedRequests = deletedRequests;
    }

    public List<String> getConclusions() {
        return conclusions;
    }

    public void setConclusions(List<String> conclusions) {
        this.conclusions = conclusions;
    }

    public Boolean getRelease() {
        return release;
    }

    public void setRelease(Boolean release) {
        this.release = release;
    }

    public Boolean getReferToImmunoHistoChemistry() {
        return referToImmunoHistoChemistry;
    }

    public void setReferToImmunoHistoChemistry(Boolean referToImmunoHistoChemistry) {
        this.referToImmunoHistoChemistry = referToImmunoHistoChemistry;
    }

    public String getSystemUserId() {
        return systemUserId;
    }

    public void setSystemUserId(String systemUserId) {
        this.systemUserId = systemUserId;
    }

    public static class PathologySlideForm extends PathologySlide {
        private static final long serialVersionUID = 3142138533368581327L;
        private String base64Image;

        public String getBase64Image() {
            return base64Image;
        }

        public void setBase64Image(String base64Image) {
            this.base64Image = base64Image;
            String[] imageInfo = base64Image.split(";base64,", 2);

            setFileType(imageInfo[0]);
            setImage(Base64.getDecoder().decode(imageInfo[1]));
        }

    }

}
