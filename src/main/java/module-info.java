module org.dargonrol.myanimelistmanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.dargonrol.myanimelistmanager to javafx.fxml;
    exports org.dargonrol.myanimelistmanager;
}