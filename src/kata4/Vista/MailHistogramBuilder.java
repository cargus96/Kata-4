package kata4.Vista;

import java.util.List;
import kata4.Modelo.Histogram;
import kata4.Modelo.Mail;

public class MailHistogramBuilder {
    public static Histogram<String> build(List<String> mail){
        Histogram<String> histo = new Histogram<>();
        for (String mail1 : mail) {
            histo.increment(new Mail(mail1).getDomain());
        }
            return histo;
        }
}
