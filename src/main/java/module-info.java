module org.dargonrol.myanimelistmanager {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;


    opens org.dargonrol.myanimelistmanager to javafx.fxml;
    exports org.dargonrol.myanimelistmanager;
    exports org.dargonrol.myanimelistmanager.framework;
    opens org.dargonrol.myanimelistmanager.framework to javafx.fxml;
}