package PageObjects.SetupPage;

public interface SetupPage {

    void setBaseUrl(String baseUrl);

    void  setSetupCode(String setupCode);

    void clickInstall();

    void checkLicenseUsage();
}
