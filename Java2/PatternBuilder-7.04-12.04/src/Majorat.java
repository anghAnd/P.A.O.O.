public class Majorat {
    private String muzica;
    private  String local;
    private int invitati;
    private String mancare;
    private String tort;
    private boolean artificii;

    private Majorat(Builder builder){
        this.muzica = builder.muzica;
        this.local  = builder.local;
        this.invitati = builder.invitati;
        this.mancare = builder.mancare;
        this.tort = builder.tort;
        this.artificii = builder.artificii;
    }

    public static class Builder{
        private String muzica;
        private String local;
        private int invitati;
        private String mancare;
        private String tort;
        private boolean artificii;

        public Builder cuMuzica(String muzica){
            this.muzica = muzica;
            return this;
        }

        public Builder cuLocal(String local) {
            this.local = local;
            return this;
        }

        public Builder cuInvitati(int nr) {
            this.invitati = nr;
            return this;
        }

        public Builder cuMancare(String mancare) {
            this.mancare = mancare;
            return this;
        }

        public Builder cuTort(String tort) {
            this.tort = tort;
            return this;
        }

        public Builder cuArtificii(boolean artificii) {
            this.artificii = artificii;
            return this;
        }

        public Majorat build(){
            return new Majorat(this);
        }
    }

    @Override
    public String toString(){
        return "Majorat{"+
                "muzica='"+ muzica + '\''+
                ", local='" + local + '\'' +
                ", invitati=" + invitati +
                ", mancare='" + mancare + '\'' +
                ", tort='" + tort + '\'' +
                ", artificii=" + artificii +
                '}';

    }

}
