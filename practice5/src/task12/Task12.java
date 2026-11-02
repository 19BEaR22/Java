package task12;

import java.util.*;

public class Task12 {
    public static void main(String[] args) {
        Repository<String, Course> repo = new InMemoryRepository<>();

        repo.save("IS541", new Course("IS541", "Intro"));
        repo.save("IS541", new Course("IV523", "Math"));
        repo.save("IS541", new Course("IS541", "Intro 2"));
        
        System.out.println("Find: " + repo.findById("IS541").orElseThrow());
        System.out.println("All: " + repo.findAll());
        System.out.println("Delete: " + repo.deleteByID("IV523"));
        System.out.println("All: " + repo.findAll());
    }

    interface Repository<ID, T>{
        void save(ID id, T entity);
        Optional<T> findById(ID id);
        List<T> findAll();
        boolean deleteByID(ID id);
    }

    static class InMemoryRepository<ID, T> implements Repository<ID, T>{
        private final Map<ID, T> store = new LinkedHashMap<>();
        
        @Override 
        public void save(ID id, T entity){
            if(id == null || entity == null)
                throw new IllegalArgumentException("null нельзя");
            store.put(id, entity);
        }

        @Override 
        public Optional<T> findById(ID id){
            return Optional.ofNullable(store.get(id));
        }

        @Override 
        public List<T> findAll(){
            return new ArrayList<>(store.values());
        }

        @Override 
        public boolean deleteByID(ID id){
            return store.remove(id) != null;
        }
    }
}
