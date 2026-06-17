public class PROYECTO_INVESTIGACIÓN {
	static class AIInfo {
		String name;
		String shortDesc;
		String[] tips;

		AIInfo(String name, String shortDesc, String[] tips){
			this.name = name;
			this.shortDesc = shortDesc;
			this.tips = tips;
		}
	}

	public static void main(String[] args){
		AIInfo[] ais = new AIInfo[]{
			new AIInfo("HP de Géminis", "IA creativa para ideas y proyectos.", new String[]{
				"Define un objetivo claro.",
				"Pide varios bocetos.",
				"Refina una idea.",
				"Adapta al tono deseado.",
				"Revisa originalidad antes de usar."}),
			new AIInfo("Claude", "IA conversacional centrada en explicaciones.", new String[]{
				"Da contexto en tu pregunta.",
				"Pide pasos detallados.",
				"Solicita ejemplos.",
				"Verifica fuentes si es necesario.",
				"Usa resúmenes para estudiar."}),
			new AIInfo("ChatGPT", "IA versátil para tareas, código y práctica.", new String[]{
				"Especifica el formato que quieres.",
				"Incluye ejemplos y contexto.",
				"Pide varias versiones.",
				"Controla el tono y estilo.",
				"Revisa el resultado antes de compartir."})
		};

		for(AIInfo ai : ais){
			System.out.println("--- " + ai.name + " ---");
			System.out.println(ai.shortDesc);
			for(int i=0;i<ai.tips.length;i++){
				System.out.println((i+1) + ". " + ai.tips[i]);
			}
			System.out.println();
		}
	}
}
