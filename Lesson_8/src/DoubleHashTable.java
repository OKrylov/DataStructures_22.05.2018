public class DoubleHashTable extends HashTable {

    private static final int DOUDLE_HASH_CONST = 5;

    public DoubleHashTable(int size) {
        super(size);
    }



    private int hashFuncDouble(int id) {
        return DOUDLE_HASH_CONST - id % DOUDLE_HASH_CONST;
    }

    @Override
    protected int getStep(int id) {
        return hashFuncDouble(id);
    }
}
