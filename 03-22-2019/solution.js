
// 03-22-2019
// Daily Coding Problem: Problem #118 [Easy]


// Given a sorted list of integers, square the elements and give the output in sorted order.

// For example, given [-9, -2, 0, 2, 3], return [0, 4, 4, 9, 81].

var sortedListInt2 = [1, 2, 3, 4, 5, 6];
var sortedListInt = [-9, -2, 0, 2, 3];

for (var i = 0; i < sortedListInt.length; i++) {
    sortedListInt[i] = sortedListInt[i] * sortedListInt[i];
    console.log(sortedListInt[i]);
}