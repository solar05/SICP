(ns sicp.chapter01.1-15)

(defn cube [x] (* x x x))
(defn p [x] (- (* 3 x) (* 4 (cube x))))

(defn sine [angle]
  (if-not (> (Math/abs angle) 0.1)
    angle
    (p (sine (/ angle 3.0)))))

;(sine 12.15)

; (sine 12.15)
; (p (sine (4.05)))
; (p (p (sine (1.35))))
; (p (p (p (sine (0.45)))))
; (p (p (p (p (sine (0.15))))))
; (p (p (p (p (p (sine (0.05)))))))
;
; `p' is applied five times.
; The growth gain is O(log a).
