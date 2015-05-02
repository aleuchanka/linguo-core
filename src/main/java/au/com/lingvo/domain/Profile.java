package au.com.lingvo.domain;import org.springframework.data.rest.core.annotation.RestResource;import javax.persistence.*;import java.util.Date;import java.util.Set;@Entity@RestResource(path = "profile")public class Profile {    @Id    @GeneratedValue(strategy = GenerationType.AUTO)    private long id;    private String email;    private String firstName;    private String lastName;    private Date birthDate;    @Enumerated(EnumType.STRING)    private ProfileSex sex;    @OneToOne(cascade = CascadeType.ALL)    private Location location;    @OneToMany(cascade = CascadeType.ALL)    private Set<ProfileKnownLanguage> known;    @OneToMany(cascade = CascadeType.ALL)    private Set<ProfileInterestLanguage> interest;    private String imageUrl;    public long getId() {        return id;    }    public void setId(long id) {        this.id = id;    }    public String getEmail() {        return email;    }    public void setEmail(String email) {        this.email = email;    }    public String getFirstName() {        return firstName;    }    public void setFirstName(String firstName) {        this.firstName = firstName;    }    public String getLastName() {        return lastName;    }    public void setLastName(String lastName) {        this.lastName = lastName;    }    public Date getBirthDate() {        return birthDate;    }    public void setBirthDate(Date birthDate) {        this.birthDate = birthDate;    }    public ProfileSex getSex() {        return sex;    }    public void setSex(ProfileSex sex) {        this.sex = sex;    }    public String getImageUrl() {        return imageUrl;    }    public void setImageUrl(String imageUrl) {        this.imageUrl = imageUrl;    }    public Location getLocation() {        return location;    }    public void setLocation(Location location) {        this.location = location;    }    public Set<ProfileKnownLanguage> getKnown() {        return known;    }    public void setKnown(Set<ProfileKnownLanguage> known) {        this.known = known;    }    public Set<ProfileInterestLanguage> getInterest() {        return interest;    }    public void setInterest(Set<ProfileInterestLanguage> interest) {        this.interest = interest;    }}