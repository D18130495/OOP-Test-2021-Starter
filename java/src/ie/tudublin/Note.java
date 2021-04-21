package ie.tudublin;

public class Note {
    private char note;
    private int duration;
    private String type;

    public Note(char note, int duration) {
        this.note = note;
        this.duration = duration;
        if(duration == 1) {
            type = "Quaver";
        } else {
            type = "Crotchet";
        }
    }

    public char getNote() {
        return note;
    }

    public void setNote(char note) {
        this.note = note;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Note [note = " + note + " duration = " + duration + " type = " + type + "]";
    }
}