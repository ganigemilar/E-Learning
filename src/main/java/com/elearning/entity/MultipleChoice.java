package com.elearning.entity;

import java.util.*;

public class MultipleChoice extends Exam {
    private Map<String, Option> mapOptions;

    public MultipleChoice(String question, Map<String, Option> mapOptions) {
        super(question);
        this.mapOptions = mapOptions;
    }

    public Map<String, Option> getMapOptions() {
        return mapOptions;
    }

    public static class Option {
        private String optionPoint;
        private String optionDescription;
        private boolean isAnswered;

        public Option(String optionPoint, String optionDescription) {
            this.optionPoint = optionPoint;
            this.optionDescription = optionDescription;
        }

        public String getOptionPoint() {
            return optionPoint;
        }

        public void setOptionPoint(String optionPoint) {
            this.optionPoint = optionPoint;
        }

        public String getOptionDescription() {
            return optionDescription;
        }

        public void setOptionDescription(String optionDescription) {
            this.optionDescription = optionDescription;
        }

        public boolean isAnswered() {
            return isAnswered;
        }

        public void setAnswered(boolean answered) {
            isAnswered = answered;
        }
    }

    public class OptionSet<E extends Option> implements Set<E> {
        private final HashMap<Integer, E> hashMap = new HashMap<Integer, E>();

        public int size() {
            return hashMap.size();
        }

        public boolean isEmpty() {
            return hashMap.isEmpty();
        }

        public boolean contains(Object o) {
            return hashMap.containsKey(o.hashCode());
        }

        public Iterator<E> iterator() {
            return hashMap.values().iterator();
        }

        public Object[] toArray() {
            return hashMap.values().toArray();
        }

        public <T> T[] toArray(T[] a) {
            return hashMap.values().toArray(a);
        }

        public boolean add(E e) {
            if (!contains(e)) {
                hashMap.put(e.hashCode(), e);
                return true;
            }
            return false;
        }

        public boolean remove(Object o) {
            return false;
        }

        public boolean containsAll(Collection<?> c) {
            return false;
        }

        public boolean addAll(Collection<? extends E> c) {
            return false;
        }

        public boolean retainAll(Collection<?> c) {
            return false;
        }

        public boolean removeAll(Collection<?> c) {
            return false;
        }

        public void clear() {

        }
    }
}
