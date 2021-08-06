package declare.entity;


public class Project {

  private String subject;
  private String name;
  private String applicantId;
  private java.sql.Date date;
  private long applicationFunds;
  private long appropriations;
  private long researchCycle;
  private String briefIntroduction;
  private String projectUrl;
  private String teacherExamine;
  private java.sql.Timestamp teacherData;
  private String teacherRemark;
  private String administratorExamine;
  private java.sql.Timestamp administratorData;
  private String administratorRemark;
  private long projectId;


  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getApplicantId() {
    return applicantId;
  }

  public void setApplicantId(String applicantId) {
    this.applicantId = applicantId;
  }


  public java.sql.Date getDate() {
    return date;
  }

  public void setDate(java.sql.Date date) {
    this.date = date;
  }


  public long getApplicationFunds() {
    return applicationFunds;
  }

  public void setApplicationFunds(long applicationFunds) {
    this.applicationFunds = applicationFunds;
  }


  public long getAppropriations() {
    return appropriations;
  }

  public void setAppropriations(long appropriations) {
    this.appropriations = appropriations;
  }


  public long getResearchCycle() {
    return researchCycle;
  }

  public void setResearchCycle(long researchCycle) {
    this.researchCycle = researchCycle;
  }


  public String getBriefIntroduction() {
    return briefIntroduction;
  }

  public void setBriefIntroduction(String briefIntroduction) {
    this.briefIntroduction = briefIntroduction;
  }


  public String getProjectUrl() {
    return projectUrl;
  }

  public void setProjectUrl(String projectUrl) {
    this.projectUrl = projectUrl;
  }


  public String getTeacherExamine() {
    return teacherExamine;
  }

  public void setTeacherExamine(String teacherExamine) {
    this.teacherExamine = teacherExamine;
  }


  public java.sql.Timestamp getTeacherData() {
    return teacherData;
  }

  public void setTeacherData(java.sql.Timestamp teacherData) {
    this.teacherData = teacherData;
  }


  public String getTeacherRemark() {
    return teacherRemark;
  }

  public void setTeacherRemark(String teacherRemark) {
    this.teacherRemark = teacherRemark;
  }


  public String getAdministratorExamine() {
    return administratorExamine;
  }

  public void setAdministratorExamine(String administratorExamine) {
    this.administratorExamine = administratorExamine;
  }


  public java.sql.Timestamp getAdministratorData() {
    return administratorData;
  }

  public void setAdministratorData(java.sql.Timestamp administratorData) {
    this.administratorData = administratorData;
  }


  public String getAdministratorRemark() {
    return administratorRemark;
  }

  public void setAdministratorRemark(String administratorRemark) {
    this.administratorRemark = administratorRemark;
  }


  public long getProjectId() {
    return projectId;
  }

  public void setProjectId(long projectId) {
    this.projectId = projectId;
  }

}
