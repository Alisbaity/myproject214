package dbpack;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-03T18:16:46")
@StaticMetamodel(Log.class)
public class Log_ { 

    public static volatile SingularAttribute<Log, Integer> logId;
    public static volatile SingularAttribute<Log, Integer> userId;
    public static volatile SingularAttribute<Log, Integer> monthId;
    public static volatile SingularAttribute<Log, Boolean> logInOut;
    public static volatile SingularAttribute<Log, Float> logAmount;
    public static volatile SingularAttribute<Log, Integer> catId;

}