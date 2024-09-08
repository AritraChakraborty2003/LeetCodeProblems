/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let counter_index=init;
    return{
        increment:function incr(){
            return ++counter_index;
        },
        decrement:function decr(){
            return --counter_index;
        },
        reset:function resetValue(){
            counter_index=init;
            return counter_index;
        }

    }
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */