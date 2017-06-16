package collegeinformationsystem

class User {
    String email
    String password
    String role
    static constraints = {
        email email: true,nullable: false, blank: false
        password password:true,nullable: false, blank: false
        role nullable: false, blank: false
    }
}
