package cl.azurian.test.app.models;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "clients")
public class Client {

    @Id
    @Column(name = "run_client")
    @JsonProperty("run")
    private Integer run;
    @Column(name = "digit_ver_client")
    @JsonProperty("digitVerifier")
    private Integer digitVer;
    @Column(name = "first_name_client")
    @JsonProperty("name")
    private String firstName;
    @Column(name = "last_name_client")
    @JsonProperty("lastName")
    private String lastName;
    @Column(name = "phone_client")
    @JsonProperty("phone")
    private String phoneClient;

    public Integer getRun() {
        return run;
    }

    public void setRun(Integer run) {
        this.run = run;
    }

    public Integer getDigitVer() {
        return digitVer;
    }

    public void setDigitVer(Integer digitVer) {
        this.digitVer = digitVer;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneClient() {
        return phoneClient;
    }

    public void setPhoneClient(String phoneClient) {
        this.phoneClient = phoneClient;
    }

}
