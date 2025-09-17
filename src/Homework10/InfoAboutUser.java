package Homework10;

import java.util.Objects;

public class InfoAboutUser implements Cloneable {
    private int userId;
    private String userName;
    private String userDateOfBirth;
    private EmailAddress urlEmail;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public InfoAboutUser(int userId, String userName, String userDateOfBirth) {
        this.userId = userId;
        this.userName = userName;
        this.userDateOfBirth = userDateOfBirth;
    }

    @Override
    public String toString() {
        return "InfoAboutUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userDateOfBirth='" + userDateOfBirth + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        InfoAboutUser that = (InfoAboutUser) o;
        return userId == that.userId && Objects.equals(userName, that.userName) &&
                Objects.equals(userDateOfBirth, that.userDateOfBirth);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public InfoAboutUser deepClone()throws CloneNotSupportedException{
            InfoAboutUser cloned = (InfoAboutUser) super.clone();
            cloned.urlEmail = (EmailAddress) urlEmail.clone();
            return cloned;
    }


    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, userDateOfBirth);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserDateOfBirth() {
        return userDateOfBirth;
    }

    public void setUserDateOfBirth(String userDateOfBirth) {
        this.userDateOfBirth = userDateOfBirth;
    }
}
