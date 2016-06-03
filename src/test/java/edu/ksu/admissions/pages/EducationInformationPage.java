package edu.ksu.admissions.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by davidfreeman on 5/9/16.
 */
public class EducationInformationPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By highSchoolCountry = By.id("highSchoolCountry");
    private By schoolType = By.id("highSchoolTypeGED");
    private By highSchoolState = By.id("highSchoolState");
    private By highSchool = By.id("highSchoolName");
    private By plannedGraduationMonth = By.id("highSchoolGradMonth");
    private By plannedGraduationYear = By.id("highSchoolGradYear");
    private By previouslyAttendedKSUtrue = By.id("undergradForm_data_academicInfo_readmittrue");
    private By previouslyAttendedKSUfalse = By.id("undergradForm_data_academicInfo_readmitfalse");
    private By previouslyTakenClassestrue = By.id("undergradForm_data_academicInfo_takenCollegetrue");
    private By previouslyTakenClassesfalse = By.id("undergradForm_data_academicInfo_takenCollegefalse");
    private By collegeCountry = By.id("collegeCountry_0");
    private By collegeName = By.id("collegeName_0");
    private By creditHours = By.id("creditHours_0");
    private By attendanceMonthStart = By.id("undergradForm_data_previousColleges_0__fromMonth");
    private By attendanceYearStart = By.id("undergradForm_data_previousColleges_0__fromYear");
    private By attendanceMonthEnd = By.id("undergradForm_data_previousColleges_0__toMonth");
    private By attendanceYearEnd = By.id("undergradForm_data_previousColleges_0__toYear");
    private By officialTranscript = By.id("requiredCheckbox");
    private By completeDegreetrue = By.id("undergradForm_data_academicInfo_planCompleteDegreetrue");
    private By completeDegreefalse = By.id("undergradForm_data_academicInfo_planCompleteDegreefalse");
    private By completeDegreeAtKSU = By.id("undergradForm_data_academicInfo_planCompleteKStateDegreetrue");
    private By minorTrue = By.id("undergradForm_data_academicInfo_postDegreeMinortrue");
    private By baccalaureate = By.id("undergradForm_data_academicInfo_completedDegreeFirsttrue");
    private By ksuLocationDL = By.id("campusDL");
    private By ksuLocationMAN = By.id("campusMAN");
    private By minors = By.id("minors");
    private By major = By.id("majors");
    private By submit = By.id("undergradForm_next");

    private By schoolTypeForSelfReporting = By.id("highSchoolTypeHighSchool");
    private By selfReporting = By.id("undergradForm_data_SelfReportInfo_reportInfotrue");
    private By GPAScale = By.id("gpaScale");
    private By GPAWeight = By.id("undergradForm_data_selfReportInfo_gpaWeightTypeWeighted");
    private By GPA = By.id("data.selfReportInfo.gpaWeighted");
    private By ranking = By.id("undergradForm_data_selfReportInfo_rankProvidedfalse");
    private By term = By.id("undergradForm_data_selfReportInfo_termSystemSemester");
    private By lessNinthGradeClasses = By.id("delButton9");
    private By ninthGradeCourses = By.id("undergradForm_data_grade9_courseCode");
    private By ninthGradeTerm1 = By.id("undergradForm_data_grade9_term1Grade");
    private By ninthGradeTerm2 = By.id("undergradForm_data_grade9_term2Grade");
    private By lessTenthGradeClasses = By.id("delButton10");
    private By tenthGradeCourses = By.id("undergradForm_data_grade10_courseCode");
    private By tenthGradeTerm1 = By.id("undergradForm_data_grade10_term1Grade");
    private By tenthGradeTerm2 = By.id("undergradForm_data_grade10_term2Grade");
    private By lessEleventhGradeClasses = By.id("delButton11");
    private By eleventhGradeCourses = By.id("undergradForm_data_grade11_courseCode");
    private By eleventhGradeTerm1 = By.id("undergradForm_data_grade11_term1Grade");
    private By eleventhGradeTerm2 = By.id("undergradForm_data_grade11_term2Grade");
    private By lessTwelfthGradeClasses = By.id("delButton12");
    private By twelfthGradeCourses = By.id("undergradForm_data_grade12_courseCode");
    private By twelfthGradeTerm1 = By.id("undergradForm_data_grade12_term1Grade");
    private By twelfthGradeTerm2 = By.id("undergradForm_data_grade12_term2Grade");
    private By ACT = By.id("actScores");
    private By compositeScore = By.id("data.selfReportInfo.actComposite");
    private By englishScore = By.id("data.selfReportInfo.actEnglish");
    private By mathScore = By.id("data.selfReportInfo.actMath");
    private By readingScore = By.id("data.selfReportInfo.actReading");
    private By scienceScore = By.id("data.selfReportInfo.actScience");

    public EducationInformationPage(WebDriver driver, WebDriverWait wait){

        this.driver = driver;
        this.wait = wait;
    }

    public void waitForPageLoad(){
        wait.until(ExpectedConditions.presenceOfElementLocated(highSchoolCountry));
    }

    public void setHighSchoolCountry(String country){
        driver.findElement(highSchoolCountry).click();
        new Select(driver.findElement(highSchoolCountry)).selectByVisibleText(country);
    }

    public void waitForHighSchool(){ wait.until(ExpectedConditions.visibilityOfElementLocated(highSchool)); }

    public void setSchoolType(){
        driver.findElement(schoolType).click();
    }

    public void setSchoolTypeForSelfReporting() { driver.findElement(schoolTypeForSelfReporting).click(); }

    public void waitForHighSchoolState() { wait.until(ExpectedConditions.visibilityOfElementLocated(highSchoolState)); }

    public void setHighSchoolState() {
        driver.findElement(highSchoolState).click();
        new Select(driver.findElement(highSchoolState)).selectByVisibleText("Kansas");
    }

    public void setHighSchool(String hs){
        driver.findElement(highSchool).clear();
        driver.findElement(highSchool).sendKeys(hs);
    }

    public void setPlannedGraduationMonth(){
        driver.findElement(plannedGraduationMonth).click();
        new Select(driver.findElement(plannedGraduationMonth)).selectByVisibleText("May");
    }

    public void setPlannedGraduationYear(){
        driver.findElement(plannedGraduationYear).click();
        new Select(driver.findElement(plannedGraduationYear)).selectByVisibleText("2016");
    }

    public void waitForSelfReporting(){ wait.until(ExpectedConditions.presenceOfElementLocated(selfReporting)); }

    public void setSelfReporting(){ driver.findElement(selfReporting).click(); }

    public void waitForGPAScale(){ wait.until(ExpectedConditions.visibilityOfElementLocated(GPAWeight)); }

    public void setGPAScale(){
        driver.findElement(GPAScale).click();
        new Select(driver.findElement(GPAScale)).selectByVisibleText("4 PT");
    }

    public void setGPAWeight(){ driver.findElement(GPAWeight).click(); }

    public void waitForGPA() { wait.until(ExpectedConditions.visibilityOfElementLocated(GPA));}

    public void setGPA(){
        driver.findElement(GPA).clear();
        driver.findElement(GPA).sendKeys("4.0");
    }

    public void setRanking(){ driver.findElement(ranking).click(); }

    public void setTerm(){ driver.findElement(term).click(); }

    public void setNinthGradeTranscript() {

        for(int i = 0; i < 3; i++)
            driver.findElement(lessNinthGradeClasses).click();

        List<WebElement> courses = driver.findElements(ninthGradeCourses);
        List<WebElement> term1 = driver.findElements(ninthGradeTerm1);
        List<WebElement> term2 = driver.findElements(ninthGradeTerm2);
        for(int i = 0; i < courses.size(); i++) {
            courses.get(i).click();
            switch (i) {

                case 0:
                    new Select(courses.get(i)).selectByVisibleText("English 9");
                    break;

                case 1:
                    new Select(courses.get(i)).selectByVisibleText("Biology");
                    break;

                case 2:
                    new Select(courses.get(i)).selectByVisibleText("Algebra I");
                    break;

                default:
                    new Select(courses.get(i)).selectByVisibleText("Advanced Math");
            }
            term1.get(i).click();
            new Select(term1.get(i)).selectByVisibleText("A");
            term2.get(i).click();
            new Select(term2.get(i)).selectByVisibleText("A");
        }
    }

    public void setTenthGradeTranscript(){

        for(int i = 0; i < 3; i++)
            driver.findElement(lessTenthGradeClasses).click();

        List<WebElement> courses = driver.findElements(tenthGradeCourses);
        List<WebElement> term1 = driver.findElements(tenthGradeTerm1);
        List<WebElement> term2 = driver.findElements(tenthGradeTerm2);
        for(int i = 0; i < courses.size(); i++) {
            courses.get(i).click();
            switch (i) {

                case 0:
                    new Select(courses.get(i)).selectByVisibleText("English 10");
                    break;

                case 1:
                    new Select(courses.get(i)).selectByVisibleText("Chemistry");
                    break;

                case 2:
                    new Select(courses.get(i)).selectByVisibleText("Botany");
                    break;

                default:
                    new Select(courses.get(i)).selectByVisibleText("Speech");
            }
            term1.get(i).click();
            new Select(term1.get(i)).selectByVisibleText("A");
            term2.get(i).click();
            new Select(term2.get(i)).selectByVisibleText("A");
        }
    }

    public void setEleventhGradeTranscript(){

        for(int i = 0; i < 3; i++)
            driver.findElement(lessEleventhGradeClasses).click();

        List<WebElement> courses = driver.findElements(eleventhGradeCourses);
        List<WebElement> term1 = driver.findElements(eleventhGradeTerm1);
        List<WebElement> term2 = driver.findElements(eleventhGradeTerm2);
        for(int i = 0; i < courses.size(); i++) {
            courses.get(i).click();
            switch (i) {

                case 0:
                    new Select(courses.get(i)).selectByVisibleText("Mythology");
                    break;

                case 1:
                    new Select(courses.get(i)).selectByVisibleText("Aerospace");
                    break;

                case 2:
                    new Select(courses.get(i)).selectByVisibleText("Geology");
                    break;

                default:
                    new Select(courses.get(i)).selectByVisibleText("Calculus");
            }
            term1.get(i).click();
            new Select(term1.get(i)).selectByVisibleText("A");
            term2.get(i).click();
            new Select(term2.get(i)).selectByVisibleText("A");
        }
    }

    public void setTwelfthGradeTranscript(){

        for(int i = 0; i < 3; i++)
            driver.findElement(lessTwelfthGradeClasses).click();

        List<WebElement> courses = driver.findElements(twelfthGradeCourses);
        List<WebElement> term1 = driver.findElements(twelfthGradeTerm1);
        List<WebElement> term2 = driver.findElements(twelfthGradeTerm2);
        for(int i = 0; i < courses.size(); i++) {
            courses.get(i).click();
            switch (i) {

                case 0:
                    new Select(courses.get(i)).selectByVisibleText("College Composition");
                    break;

                case 1:
                    new Select(courses.get(i)).selectByVisibleText("Advanced Biology");
                    break;

                case 2:
                    new Select(courses.get(i)).selectByVisibleText("Genetics");
                    break;

                default:
                    new Select(courses.get(i)).selectByVisibleText("Trigonometry");
            }
            term1.get(i).click();
            new Select(term1.get(i)).selectByVisibleText("A");
            term2.get(i).click();
            new Select(term2.get(i)).selectByVisibleText("A");
        }
    }

    public void setACT() { driver.findElement(ACT).click(); }

    public void waitForCompositeScore() { wait.until(ExpectedConditions.visibilityOfElementLocated(compositeScore)); }

    public void setCompositeScore(String score) {
        driver.findElement(compositeScore).clear();
        driver.findElement(compositeScore).sendKeys(score);
    }

    public void setEnglishScore(String score) {
        driver.findElement(englishScore).clear();
        driver.findElement(englishScore).sendKeys(score);
    }

    public void setMathScore(String score){
        driver.findElement(mathScore).clear();
        driver.findElement(mathScore).sendKeys(score);
    }

    public void setReadingScore(String score){
        driver.findElement(readingScore).clear();
        driver.findElement(readingScore).sendKeys(score);
    }

    public void setScienceScore(String score){
        driver.findElement(scienceScore).clear();
        driver.findElement(scienceScore).sendKeys(score);
    }

    public void setPreviouslyAttendedKSUtrue(){
        driver.findElement(previouslyAttendedKSUtrue).click();
    }

    public void setPreviouslyAttendedKSUfalse() { driver.findElement(previouslyAttendedKSUfalse).click(); }

    public void setPreviouslyTakenClassestrue(){
        driver.findElement(previouslyTakenClassestrue).click();
    }

    public void setPreviouslyTakenClassesfalse() { driver.findElement(previouslyTakenClassesfalse).click(); }

    public void waitForCollegeCountry() { wait.until(ExpectedConditions.visibilityOfElementLocated(collegeCountry)); }

    public void setCollegeCountry(String country){
        driver.findElement(collegeCountry).click();
        new Select(driver.findElement(collegeCountry)).selectByVisibleText(country);
    }

    public void waitForCollegeName() { wait.until(ExpectedConditions.visibilityOfElementLocated(collegeName)); }

    public void setCollegeName(String college){
        driver.findElement(collegeName).clear();
        driver.findElement(collegeName).sendKeys(college);
    }

    public void setCreditHours(String hours){
        driver.findElement(creditHours).clear();
        driver.findElement(creditHours).sendKeys(hours);
    }

    public void setAttendanceMonthStart(String month){
        driver.findElement(attendanceMonthStart).click();
        new Select(driver.findElement(attendanceMonthStart)).selectByVisibleText(month);
    }

    public void setAttendanceYearStart(String year){
        driver.findElement(attendanceYearStart).click();
        new Select(driver.findElement(attendanceYearStart)).selectByVisibleText(year);
    }

    public void setAttendanceMontEnd(String month){
        driver.findElement(attendanceMonthEnd).click();
        new Select(driver.findElement(attendanceMonthEnd)).selectByVisibleText(month);
    }

    public void setAttendanceYearEnd(String year){
        driver.findElement(attendanceYearEnd).click();
        new Select(driver.findElement(attendanceYearEnd)).selectByVisibleText(year);
    }

    public void setOfficialTranscript(){
        driver.findElement(officialTranscript).click();
    }

    public void waitForCompleteDegree(){ wait.until(ExpectedConditions.visibilityOfElementLocated(completeDegreetrue)); }

    public void setCompleteDegreetrue() { driver.findElement(completeDegreetrue).click(); }

    public void setCompleteDegreefalse(){
        driver.findElement(completeDegreefalse).click();
    }

    public void waitForCompleteDegreeAtKSU() { wait.until(ExpectedConditions.visibilityOfElementLocated(completeDegreeAtKSU)); }

    public void setCompleteDegreeAtKSU(){
        driver.findElement(completeDegreeAtKSU).click();
    }

    public void waitForMinor() { wait.until(ExpectedConditions.visibilityOfElementLocated(minorTrue)); }

    public void setMinorTrue(){
        driver.findElement(minorTrue).click();
    }

    public void waitForBaccalaureate() { wait.until(ExpectedConditions.visibilityOfElementLocated(baccalaureate)); }

    public void setBaccalaureate(){
        driver.findElement(baccalaureate).click();
    }

    public void setKsuLocationDL(){
        driver.findElement(ksuLocationDL).click();
    }

    public void setKsuLocationMAN() { driver.findElement(ksuLocationMAN).click(); }

    public void setMinor(){
        driver.findElement(minors).click();
        new Select(driver.findElement(minors)).selectByIndex(5);
    }

    public void setMajor(){
        driver.findElement(major).click();
        new Select(driver.findElement(major)).selectByIndex(5);
    }

    public void submit(){
        driver.findElement(submit).click();
    }
}
