// C++
template<class T, class U>
bool are_equal(T a, U b) {
    return (a == b);
}

are_equal(10, 10.0)

// Java
public stsatic<T, U> boolean are_equal(T a, U b) {
    return a == b;
}

are_equal(10, 10.0);

// Python
def are_equal(a, b):
    return a==b

are_equal(10, 10.0)

// Python
from typing import TypeVar

T = TypeVar('T')
U = TypeVar('U' )

def are_equal(a: T, b: U) -> bool:
    return a==b

are_equal(10, 10.0)

// TypeScript
function are_equal<T, U>(a: T, b: U): boolean {
    return +a == +b;
}

are_equal<number, number>(10, 10.0);