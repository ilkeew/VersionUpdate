package cn.dagongniu.oax.updatedemotest;

/**
 * Created by 更新 on 2017/11/28.
 */

public class UpdateBean {
    

    private String description;//描述
    private int versionCode;//版本号
    private String downloadUrl;//下载地址
    private String versionName;//版本名

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(int versionCode) {
        this.versionCode = versionCode;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }
}
