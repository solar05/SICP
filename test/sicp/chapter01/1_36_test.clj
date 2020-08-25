(ns sicp.chapter01.1-36-test
  (:require [clojure.test :refer :all]
            [sicp.chapter01.1-36 :refer :all]))

(deftest test-solution
  (testing "With dump."
    (is (= 9 (:steps (solution-with-average-dump 2.0))))
    (is (= 4.555537700653076 (:value (solution-with-average-dump 2.0)))))
  (testing "Without dump."
    (is (= 34 (:steps (solution-without-average-dump 2.0))))
    (is (= 4.555532270803653 (:value (solution-without-average-dump 2.0))))))
