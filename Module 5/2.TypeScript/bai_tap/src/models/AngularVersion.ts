import {Item} from "./Item";

export interface AngularVersion {
    total_count: number;
    incomplete_results: boolean;
    items: Item[];
}
