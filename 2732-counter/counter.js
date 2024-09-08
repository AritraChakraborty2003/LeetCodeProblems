/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    var counter_index=n;
    return function() {
        return counter_index++;        
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */