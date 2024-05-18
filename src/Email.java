public class Email {
    String from;
    String to;
    String sub;
    String body;

    public Email(String from, String to, String sub, String body) {
        this.from = from;
        this.to = to;
        this.sub = sub;
        this.body = body;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Email{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", sub='" + sub + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
