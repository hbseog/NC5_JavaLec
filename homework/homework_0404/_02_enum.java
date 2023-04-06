package homework_0404;

public enum _02_enum {
    AMERICANO(2000,2300,"아메리카노"){
        public int totalPrice(int normalOrder, int optionOrder){
            System.out.println((optionOrder*getNormal())+(normalOrder*getOption()));
            return (optionOrder*getNormal())+(normalOrder*getOption());
        }
    }, LATTE(3000,3500,"라떼"){
        public int totalPrice(int normalOrder, int optionOrder){
            System.out.println((optionOrder*getNormal())+(normalOrder*getOption()));

            return (optionOrder*getNormal())+(normalOrder*getOption());
        }
    }, MOCHA(4000,5000,"모카"){
        public int totalPrice(int normalOrder, int optionOrder){
            System.out.println((optionOrder*getNormal())+(normalOrder*getOption()));

            return (optionOrder*getNormal())+(normalOrder*getOption());
        }
    }, COLDBREW(4500,4700,"콜드부르"){
        public int totalPrice(int normalOrder, int optionOrder){
            System.out.println((optionOrder*getNormal())+(normalOrder*getOption()));

            return (optionOrder*getNormal())+(normalOrder*getOption());
        }
    };
    private int normal, option;
    private String name;
    public int getNormal() {
        return normal;
    }

    public int getOption() {
        return option;
    }

    public String getName() {
        return name;
    }

    _02_enum(int normal, int option, String name) {
        this.normal = normal;
        this.option = option;
        this.name = name;
    }
    public abstract int totalPrice(int normalOrder, int optionOrder);
}
