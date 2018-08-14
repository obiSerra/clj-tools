(ns tools.macros-test
  (:require [clojure.test :refer :all]
            [tools.macros :as m]))

(deftest if-let->macro
  (testing "no nesting"
    (is (= 1 (m/if-let-> [one 1] :out-on-one)))
    (is (= :out-on-one (m/if-let-> [one nil] :out-on-one))))

  (testing "one level deep"
    (is (= 2 (m/if-let-> [one 1] :out-on-one
                         [two (+ one 1)] :out-on-two)))
    (is (= :out-on-two (m/if-let-> [one 1]  :out-on-one
                                   [two nil]  :out-on-two))))

  (testing "two level deep"
    (is (= 20 (m/if-let-> [one 1] :out-on-one
                         [two (+ one 1)] :out-on-two
                         [max (and (< two 10) 20)] :out-on-max)))
    (is (= :out-on-max (m/if-let-> [one 1] :out-on-one
                                   [two 2] :out-on-two
                                   [max (and (> two 10) 20)] :out-on-max)))))
