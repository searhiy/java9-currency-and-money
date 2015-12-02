
#Money 
represents a effective implementation, which is based on java.math.BigDecimal 
internally for performing the arithmetic operations. The implementation is capable 
of supporting arbitrary precision and scale.

#FastMoney 
represents numeric representation that was optimized for speed. It represents 
a monetary amount only as a integral number of type long, hereby using 
a number scale of 100'000 (10^5).

#RoundedMoney 
finally provides an amount implementation thar is implicitly rounded after each operation.

Basically, if the numeric capabilities of FastMoney are sufficient for your use cases, 
you may use this type. If not sure, using Money is in general safe. RoundedMoney should only be used, 
if you are well aware of its usage, since the immediate rounding may produce unwanted 
side effects (invalid values).
