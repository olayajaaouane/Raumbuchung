package Raumbuchungsmodel;

public class Kurs {
    private String Kursbezeichnung ;
    private String Dozent;
    private String Semester ;
    private int Teilnehmeranzahl ;

    public String getKursbezeichnung() {
        return Kursbezeichnung;
    }

    public void setKursbezeichnung(String Kursbezeichnung) {
        this.Kursbezeichnung = Kursbezeichnung;
    }
    public String getDozent() {
        return Dozent;
    }

    public void setDozent(String Dozent) {
        this.Dozent = Dozent;
    }
    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }
    public int getTeilnehmeranzahl() {
        return Teilnehmeranzahl;
    }

    public void setTeilnehmeranzahl(int Teilnehmeranzahl) {
        this.Teilnehmeranzahl = Teilnehmeranzahl;
    }
}
