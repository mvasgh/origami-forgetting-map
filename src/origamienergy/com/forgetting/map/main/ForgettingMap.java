package origamienergy.com.forgetting.map.main;

import java.util.concurrent.ConcurrentHashMap;

public final class ForgettingMap<K, V> extends ConcurrentHashMap<K, V> {

	private final int maxAssociations;
	
	public ForgettingMap(final int maxAssociations) {
        this.maxAssociations = maxAssociations;
    }

	 /**
     * Returns the maximum x associations at any time
     *
     * @return value representing the maximum associations
     * that states the limit of the {@code ForgettingMap}.
     */
	public Integer getMaxAssociations() {
		return maxAssociations;
	}

	/**
     * Maps the specified key to the specified value in this structure.
     *
     * @param key Key with which the specified value is to be associated.
     * @param value Value to be associated with the specified key.
     */
	public V add(K key, V value) {
		if (size() >= maxAssociations) {
			//TODO
        }
        return put(key, value);
		
	}
	

	public V find(K	key) {
		// TODO 
		return get(key);
	}

}