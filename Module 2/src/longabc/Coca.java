package longabc;

public class Coca implements SanPham, Comparable<Coca> {
    private int size;

    public Coca(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public float getValue() {
        return size * 5 + size * 2;
    }

    @Override
    public String getName() {
        return "Coca";
    }

    @Override
    public int compareTo(Coca o) {
        int theoname = this.getName().compareTo(o.getName());
        if (theoname == 0) {
            int theotupi = this.getSize() - o.getSize();
            return theotupi;
        }
        return theoname;
    }
}
