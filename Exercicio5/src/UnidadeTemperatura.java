public enum UnidadeTemperatura {
    CELSIUS {
        @Override
        public double converterPara(double valor, UnidadeTemperatura unidade) {
            switch (unidade) {
                case FAHRENHEIT:
                    return (valor * 9 / 5) + 32;
                case KELVIN:
                    return valor + 273.15;
                default:
                    return valor;
            }
        }
    },
    FAHRENHEIT {
        @Override
        public double converterPara(double valor, UnidadeTemperatura unidade) {
            switch (unidade) {
                case CELSIUS:
                    return (valor - 32) * 5 / 9;
                case KELVIN:
                    return (valor + 459.67) * 5 / 9;
                default:
                    return valor;
            }
        }
    },
    KELVIN {
        @Override
        public double converterPara(double valor, UnidadeTemperatura unidade) {
            switch (unidade) {
                case CELSIUS:
                    return valor - 273.15;
                case FAHRENHEIT:
                    return (valor * 9 / 5) - 459.67;
                default:
                    return valor;
            }
        }
    };

    public abstract double converterPara(double valor, UnidadeTemperatura unidade);
}
