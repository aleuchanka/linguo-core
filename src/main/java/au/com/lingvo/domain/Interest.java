package au.com.lingvo.domain;import javax.persistence.*;@Entitypublic class Interest {    @Id    @GeneratedValue(strategy = GenerationType.AUTO)    private long id;    @ManyToOne    @JoinColumn(name = "language_id")    private Language language;    @Enumerated(EnumType.STRING)    private LanguageLevel level;    public long getId() {        return id;    }    public void setId(long id) {        this.id = id;    }    public Language getLanguage() {        return language;    }    public void setLanguage(Language language) {        this.language = language;    }    public LanguageLevel getLevel() {        return level;    }    public void setLevel(LanguageLevel level) {        this.level = level;    }}