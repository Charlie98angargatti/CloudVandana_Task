const numbers = [8,6,7,12,1,4,2,3];


numbers.sort(function(a, b) {
  return b - a;
});

console.log(numbers);