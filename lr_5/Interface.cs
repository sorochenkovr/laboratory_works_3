using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lr_5
{
    public interface ICalculate
    {
        void Mult_1(int Mult1);
        void Mult_2(int Mult2);
    }
    public interface IVisual
    {
        string Species { get;}
        void DrawAnimal ();
    }
}
