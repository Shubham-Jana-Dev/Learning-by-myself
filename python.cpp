#include <Pyhton.h>
int main() {
    // 1. Initialize the Python Interpreter
    Py_Initialize();
    cout << isalpha("A")<<endl;
    // 2. Define multiple lines of Python code using a raw string literal
    const char* pythonCode = R"(
import math

def calculate_area(radius):
    return math.pi * radius ** 2

r = 5
print(f"The area of a circle with radius {r} is: {calculate_area(r)}")
)";

    // 3. Run the code
    PyRun_SimpleString(pythonCode);

    
    Py_Finalize();

    return 0;
}
