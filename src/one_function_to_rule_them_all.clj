(ns one-function-to-rule-them-all)

(defn concat-elements [a-seq]
  (reduce concat '() a-seq))

(defn str-cat [a-seq]
  (if (empty? a-seq)
    ""
    (let [b-seq (interpose " " a-seq)] 
    (reduce str b-seq))))

(defn my-interpose [x a-seq]
  (reduce (fn [a-val b-val] (if (empty? a-val) 
                              (conj [] b-val )
                              (conj a-val x b-val)))
          [] a-seq))

(defn my-count [a-seq]
  (reduce (fn [a-val b-val] (+ a-val 1)) 0 a-seq))

(defn my-reverse [a-seq]
  (reduce (fn [a-val b-val] 
            (cons b-val a-val)) 
          [] a-seq))

(defn min-max-element [a-seq]
  (let [a-min (reduce min a-seq)
        a-max (reduce max a-seq)]
    [a-min a-max]))

(defn insert [sorted-seq n]
  (let [front (take-while (fn [x] (< x n)) sorted-seq)
        back (drop-while (fn [x] (<= x n)) sorted-seq)]
    (concat front [n] back)))

(defn insertion-sort [a-seq]
  (reduce insert [] a-seq))

(defn toggleElem [a-set elem]
  (cond
    (contains? a-set elem) (disj a-set elem)
    :else (conj a-set elem)))

(defn parity [a-seq]
  (reduce toggleElem #{} a-seq))

(defn minus [x]
  :-)

(defn count-params [x]
  :-)

(defn my-* [x]
  :-)

(defn pred-and [x]
  (fn [x] :-))

(defn my-map [f a-seq]
  [:-])
