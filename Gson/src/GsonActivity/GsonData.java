package GsonActivity;

import com.google.gson.annotations.SerializedName;

public class GsonData {
	
	 @SerializedName("errorCode")
	    private Long mErrorCode;
	    @SerializedName("errorMessage")
	    private String mErrorMessage;
	    @SerializedName("errorUuid")
	    private String mErrorUuid;
	    @SerializedName("success")
	    private Boolean mSuccess;

	    public Long getErrorCode() {
	        return mErrorCode;
	    }

	    public void setErrorCode(Long errorCode) {
	        mErrorCode = errorCode;
	    }

	    public String getErrorMessage() {
	        return mErrorMessage;
	    }

	    public void setErrorMessage(String errorMessage) {
	        mErrorMessage = errorMessage;
	    }

	    public String getErrorUuid() {
	        return mErrorUuid;
	    }

	    public void setErrorUuid(String errorUuid) {
	        mErrorUuid = errorUuid;
	    }

	    public Boolean getSuccess() {
	        return mSuccess;
	    }

	    public void setSuccess(Boolean success) {
	        mSuccess = success;
	    }

}
