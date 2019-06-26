package com.learning.effective_java.eight;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Set;

/**
 * 慎重使用重载
 *
 * @author kian
 * @date 2019/6/20
 */
public class CollectionClassifier {
    private Set set;
    private Collection collection;

    public CollectionClassifier(Set set) {
        this.set = set;
    }

    public CollectionClassifier(Collection collection) {
        this.collection = collection;
    }
}
