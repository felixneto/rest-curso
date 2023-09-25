package pt.felixneto.apigateway.data.entities;

public record User(Long id, String firstName,String lastName, String address, String gender) {
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User) {
            if (this == obj) {
                return true;
            }
            if (((User)obj).id == this.id) {
                return true;
            }
        }
        return false;
    }
    
}
