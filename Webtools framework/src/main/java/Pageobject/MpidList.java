package Pageobject;

public enum MpidList {
    EMPTY(""),
    ALL("All"),
    OI("--01"),
    OII("--02"),
    TEST_AUTOMATION("tA"),
    TEST_AUTOMATION02("tA02");



    private String name;

    MpidList(String name){
        this.name = name;
    }
    public String getMpid(){
        return  name;
    }
}