package Ejerciciotema5;

public abstract class Coche {


    public abstract void save();

    public abstract void findAll();

    public abstract void delete();

    public interface CocheCRUD {

        void save();
        void findAll();
        void delete();

    }
}
