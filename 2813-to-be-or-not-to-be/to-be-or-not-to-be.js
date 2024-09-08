/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
 return {
   toBe:function cb(val1){
        if(val===val1) return true;
        else throw new Error("Not Equal");
    },
    notToBe:function cb1(val3){
        if(val3!==val) return true;
        else throw new Error("Equal");
    }
     
 }
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */