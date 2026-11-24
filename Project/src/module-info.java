module Project {
    requires com.google.gson;
    requires org.json;

    exports radiocare.entities;
    exports radiocare.repositories;
    exports radiocare.presentation;
    opens radiocare.entities to com.google.gson;
}