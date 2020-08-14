(ns sicp.chapter01.1-21)

(defn square [x]
  (* x x))

(defn find-divisor [n test-divisor]
  (cond
    (> (square test-divisor) n) n
    (divides? test-divisor n) test-divisor
    :else (find-divisor n (inc test-divisor))))

(defn prime? [n]
  (= n (smallest-divisor n)))

(defn divides? [a b]
  (zero? (rem b a)))

(defn smallest-divisor [n]
  (find-divisor n 2))

