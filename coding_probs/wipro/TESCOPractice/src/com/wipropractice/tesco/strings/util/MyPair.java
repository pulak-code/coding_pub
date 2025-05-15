package com.wipropractice.tesco.strings.util;

import java.util.Objects;

public class MyPair<K, V> {

	private final K key;
	private final V value;

	public MyPair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		MyPair<?, ?> pair = (MyPair<?, ?>) o;
		return Objects.equals(key, pair.key) && Objects.equals(value, pair.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(key, value);
	}

	@Override
	public String toString() {
		// Assuming the desired output format for the Pair object itself is key-value
		return key + "-" + value;
	}
}
