import java.io.FileWriter;
import java.io.IOException;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        NonProfitOrg a1 = new NonProfitOrg("aaa", 1220, 1220);
        a1.vivod();
        out.println(a1.getQ());
        ProfitMakingOrganization a2 = new ProfitMakingOrganization("bbb", 12233, 12233);
        a2.vivod();
        out.println(a2.getQQ());
        }
    }
