
package model;

public class Friends {
    private int friendID;
    private String friendName;
    private String emailAddr;
    private int age;
    private String facoriteColor;

    public Friends() {
        this.friendID = 0;
        this.friendName = "";
        this.emailAddr = "";
        this.age = 0;
        this.facoriteColor = "";
    }
    
     public Friends(int friendID, String friendName, String emailAddr, int age, String facoriteColor) {
        this.friendID = friendID;
        this.friendName = friendName;
        this.emailAddr = emailAddr;
        this.age = age;
        this.facoriteColor = facoriteColor;
    }

    public int getFriendID() {
        return friendID;
    }

    public void setFriendID(int friendID) {
        this.friendID = friendID;
    }

    public String getFriendName() {
        return friendName;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFacoriteColor() {
        return facoriteColor;
    }

    public void setFacoriteColor(String facoriteColor) {
        this.facoriteColor = facoriteColor;
    }

    @Override
    public String toString() {
        return "Friends{" + "friendID=" + friendID + ", friendName=" + friendName + ", emailAddr=" + emailAddr + ", age=" + age + ", facoriteColor=" + facoriteColor + '}';
    }
    
   
    
    
}
