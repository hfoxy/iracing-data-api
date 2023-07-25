package me.hfox.iracing.data.api.data.auth;

public class AuthResponse {

    private String authcode;
    private String autoLoginSeries;
    private String autoLoginToken;
    private int custId;
    private String email;
    private String ssoCookieDomain;
    private String ssoCookieName;
    private String ssoCookiePath;
    private String ssoCookieValue;

    public String getAuthcode() {
        return authcode;
    }

    public void setAuthcode(String authcode) {
        this.authcode = authcode;
    }

    public String getAutoLoginSeries() {
        return autoLoginSeries;
    }

    public void setAutoLoginSeries(String autoLoginSeries) {
        this.autoLoginSeries = autoLoginSeries;
    }

    public String getAutoLoginToken() {
        return autoLoginToken;
    }

    public void setAutoLoginToken(String autoLoginToken) {
        this.autoLoginToken = autoLoginToken;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSsoCookieDomain() {
        return ssoCookieDomain;
    }

    public void setSsoCookieDomain(String ssoCookieDomain) {
        this.ssoCookieDomain = ssoCookieDomain;
    }

    public String getSsoCookieName() {
        return ssoCookieName;
    }

    public void setSsoCookieName(String ssoCookieName) {
        this.ssoCookieName = ssoCookieName;
    }

    public String getSsoCookiePath() {
        return ssoCookiePath;
    }

    public void setSsoCookiePath(String ssoCookiePath) {
        this.ssoCookiePath = ssoCookiePath;
    }

    public String getSsoCookieValue() {
        return ssoCookieValue;
    }

    public void setSsoCookieValue(String ssoCookieValue) {
        this.ssoCookieValue = ssoCookieValue;
    }

}
