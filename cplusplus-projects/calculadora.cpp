#include <stdio.h>
#include <conio.h>
#include <windows.h>
#include <math.h>

    // Con la etiqueta # directiva de preprocesador, include carga todo el fichero

float suma(float num1, float num2);
float resta(float num1, float num2);
float multi(float num1, float num2);
float divide(float num1, float num2);
float elevar(float num1, float elevador);
float raiz(float num1);

int seleccion=1;
float numero1, numero2;

void mostrar_menu();
void funcionamiento();
float operar();
void mostrar_res(float res);


enum opcion
{
    k_salir,
    k_sumar,
    k_restar,
    k_multiplicar,
    k_dividir,
    k_elevar,
    k_raiz
};

int main()
{
    while(true)
        {
            mostrar_menu();
            funcionamiento();
            float res = operar();
            mostrar_res(res);
        }

    return 0;
}


float suma(float num1, float num2)
{
    return num1 + num2;
}

float resta(float num1, float num2)
{
    return num1 - num2;
}

float multi(float num1, float num2)
{
    return num1 * num2;
}

float divide(float num1, float num2)
{
    return num1 / num2;
}

float elevar(float num1, float elevador)
{
    float result = 1;
    for(int i = 0; i < (int)elevador; ++i){
        result *= num1;
    }

    return result;
}

float raiz(float num1)
{
    float result = sqrt(num1);
    return result;
}

void funcionamiento()
{
    scanf("%d",&seleccion);
    system("cls");
    switch(seleccion)
    {
        case k_sumar:
            {
                printf("\n--Sumar \n");

                printf("numero 1: ");
                scanf("%f",&numero1);

                printf("numero 2: ");
                scanf("%f",&numero2);
            }break;
        case k_restar:
            {
                printf("\n--Restar \n");
                printf("numero 1: ");
                scanf("%f",&numero1);

                printf("numero 2: ");
                scanf("%f",&numero2);
            }break;
        case k_multiplicar:
            {
                printf("\n--Multiplicar \n");
                printf("numero 1: ");
                scanf("%f",&numero1);

                printf("numero 2: ");
                scanf("%f",&numero2);
            }break;
        case k_dividir:
            {
                printf("\n--Dividir \n");
                printf("numero 1: ");
                scanf("%f",&numero1);

                printf("numero 2: ");
                scanf("%f",&numero2);
            }break;
        case k_elevar:
            {
                printf("\n--Elevar \n");
                printf("numero 1: ");
                scanf("%f",&numero1);

                printf("numero 2: ");
                scanf("%f",&numero2);
            }break;
        case k_raiz:
            {
                printf("\n--Raiz cuadrada \n");
                printf("Introduce el numero: ");
                scanf("%f",&numero1);
            }break;

            case k_salir:
            {
                exit(0);
            }break;
            default:
                printf("Opcion invalida");
   }
}

float operar()
{
    float resultado;

    switch(seleccion)
    {
        case k_sumar:
            {
                resultado = suma(numero1,numero2);
            }
            break;
        case k_restar:
            {
                resultado = resta(numero1,numero2);
            }break;
        case k_multiplicar:
            {
                resultado = multi(numero1,numero2);
            }break;
        case k_dividir:
            {
                resultado = divide(numero1,numero2);
            }break;
        case k_elevar:
            {
                resultado = elevar(numero1,numero2);
            }break;
        case k_raiz:
            {
                resultado = raiz(numero1);
            }break;
   }
    return resultado;
}

void mostrar_res(float res)
{
    printf("\n El resultado es: %.2f \n",res);
    system("pause");
}

void mostrar_menu()
{
    system("cls");

    printf("\n ----------- CALCULADORA ------------\n");

    printf("\n %i --- Suma", k_sumar);
    printf("\n %i --- Resta", k_restar);
    printf("\n %i --- Multiplicar", k_multiplicar);
    printf("\n %i --- Dividir", k_dividir);
    printf("\n %i --- Elevar", k_elevar);
    printf("\n %i --- Raiz cuadrada", k_raiz);
    printf("\n %i --- Salir del programa. \n", k_salir);
    printf("\n Selecciona Opcion: ");
}
